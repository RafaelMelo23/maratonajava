package devdojo.maratona.java.javacore.ZZDoptional.repositorio;

import devdojo.maratona.java.javacore.ZZDoptional.dominio.LegendsBook;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class LegendsBookRepository {

    private static List<LegendsBook> legendsBooks = List.of(new LegendsBook(1, "Darth Plagueis", 50),
            new LegendsBook(2, "Heir to the Empire", 50));


    public static Optional<LegendsBook> findById(int id) {

         return findBy(book -> book.getId() == id);
    }

    public static Optional<LegendsBook> findByTitle(String title) {

        return findBy(book -> book.getTitle().equalsIgnoreCase(title));
    }

    private static Optional<LegendsBook> findBy(Predicate<LegendsBook> predicate) {

        for (LegendsBook legendsBook : legendsBooks) {

            if (predicate.test(legendsBook)) {
                return Optional.of(legendsBook);
            }
        }
        return Optional.empty();
    }
}
