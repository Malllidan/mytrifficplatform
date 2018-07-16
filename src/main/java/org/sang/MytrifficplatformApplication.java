package org.sang;
/**
 * Malllidan 2018-7-16
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MytrifficplatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(MytrifficplatformApplication.class, args);
	}

	@Value(value="${book.author}")//@Value(value="${srting}")注入静态数据
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	@Value("${book.pinyin}")
	private String bookPinYin;
	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	String index(){
		return "Hello Spring Boot!The Book Name is:"+ bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;

	}
}
