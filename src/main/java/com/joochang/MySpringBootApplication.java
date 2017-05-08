package com.joochang;

import com.joochang.lotto.MyLottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication implements CommandLineRunner{


	@Autowired MyLottoService myLottoService;

	@Override
	public void run(String... args) {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(this.myLottoService.toString());
		System.out.println(this.myLottoService.getPersonnelName());
		System.out.println("-- Min-Idle=" + this.myLottoService.getTomcatMinIdel());
//		if (args.length > 0 && args[0].equals("exitcode")) {
//			throw new ExitException();
//		}
	}

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
	}
}
