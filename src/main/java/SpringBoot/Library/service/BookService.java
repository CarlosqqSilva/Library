package SpringBoot.Library.service;

import SpringBoot.Library.dto.book.BookGetDto;
import SpringBoot.Library.dto.book.BookPostDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<BookGetDto> getAllBooks();

    BookGetDto getBookById(Long id);

    BookPostDto saveBook(BookPostDto bookPostDto);

    void deleteBookById(Long id);
}
