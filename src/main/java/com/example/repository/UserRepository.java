package com.example.repository;

import com.example.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;

import java.util.Collections;
import java.util.Optional;

@Repository
public class UserRepository {

    private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<User> findUserById(Long empId) {
        try {
            logger.info("Finding User with ID: {}", empId);
            User User = entityManager.find(User.class, empId);
            return Optional.ofNullable(User);
        } catch (IllegalArgumentException e) {
            logger.error("Invalid ID provided for User lookup: {}", empId, e);
            return Optional.empty();
        } catch (DataAccessException e) {
            logger.error("Database error while finding User with ID: {}", empId, e);
            return Optional.empty();
        }
    }

    public List<User> findAllUsers() {
        try {
            logger.info("Retrieving all Users");
            TypedQuery<User> query = entityManager.createQuery(
                    "SELECT e FROM User e", User.class);
            return query.getResultList();
        } catch (DataAccessException e) {
            logger.error("Database error while retrieving all Users", e);
            return Collections.emptyList();
        }
    }


    @Transactional
    public boolean createUser(User User) {
        try {
            logger.info("Creating new User with ID: {}", User.getId());
            entityManager.persist(User);
            entityManager.flush();
            return true;
        } catch (IllegalArgumentException e) {
            logger.error("Invalid User data: {}", User, e);
            return false;
        } catch (DataAccessException e) {
            logger.error("Database error while creating User: {}", User, e);
            return false;
        }
    }

    @Transactional
    public boolean updateUser(User User) {
        try {
            if (User.getId()== null) {
                logger.error("Cannot update User with null ID");
                return false;
            }

            logger.info("Updating User with ID: {}", User.getId());
            User managedUser = entityManager.find(User.class, User.getId());

            if (managedUser == null) {
                logger.error("User with ID {} not found for update", User.getId());
                return false;
            }

            // Update fields
            managedUser.setName(User.getName());
            managedUser.setEmail(User.getEmail());
            managedUser.setPassword(User.getPassword());
            managedUser.setActive(User.getActive());

            entityManager.merge(managedUser);
            entityManager.flush();
            return true;
        } catch (IllegalArgumentException e) {
            logger.error("Invalid User data for update: {}", User, e);
            return false;
        } catch (DataAccessException e) {
            logger.error("Database error while updating User: {}", User, e);
            return false;
        }
    }

    @Transactional
    public boolean deleteById(Long empId) {
        try {
            logger.info("Deleting User with ID: {}", empId);
            User User = entityManager.find(User.class, empId);

            if (User == null) {
                logger.error("User with ID {} not found for deletion", empId);
                return false;
            }

            entityManager.remove(User);
            return true;
        } catch (IllegalArgumentException e) {
            logger.error("Invalid ID provided for User deletion: {}", empId, e);
            return false;
        } catch (DataAccessException e) {
            logger.error("Database error while deleting User with ID: {}", empId, e);
            return false;
        }
    }


}