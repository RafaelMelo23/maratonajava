package javacore.ZZDoptional.test;

import javacore.ZZDoptional.dominio.LegendsBook;
import javacore.ZZDoptional.repositorio.LegendsBookRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        Optional<LegendsBook> bookByTitle = LegendsBookRepository.findByTitle("Darth Plagueis");
        bookByTitle.ifPresent(book -> book.setTitle(book.getTitle() + " by James Luceno"));
        System.out.println(bookByTitle);

        LegendsBook bookById = LegendsBookRepository.findById(1)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(bookById);

        LegendsBook newBook = LegendsBookRepository.findByTitle("Labyrinth of Evil")
                .orElseGet(() -> new LegendsBook(3, "Labyrinth of Evil By James Luceno", 450));
        System.out.println(newBook);
    }
}
