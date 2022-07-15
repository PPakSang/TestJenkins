package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
public class ItemUpdateTest {

    @Autowired
    EntityManager em;

    public void updateTest() throws Exception {
        Book book = em.find(Book.class, 1L);

        //Dirty Check
        book.setName("123");


    }
}
