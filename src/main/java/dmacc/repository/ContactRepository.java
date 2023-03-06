/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Feb 28, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Contact;

/**
 * @author abbyb
 *
 */
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
