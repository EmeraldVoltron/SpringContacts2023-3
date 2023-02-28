/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 28, 2023
 */
package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import beans.Contact;

/**
 * @author abbyb
 *
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
