package de.holisticon.pitmutationtest;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.holisticon.pitmutationtest.subject.BoyerMooreHorspoolAlgorithm;
import de.holisticon.pitmutationtest.subject.Quicksort;

/**
 * Hello world!
 */
@SpringBootApplication
@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class App {
  private static final Logger LOG = Logger.getLogger(App.class);

  public static void main(String[] args) {
    SpringApplication
        .run(App.class)
        .close();
  }

  @Bean
  public CommandLineRunner run() {
    return args -> {
      Quicksort qs = new Quicksort();
      List<Integer> integers = qs.sort(Arrays.asList(7, 4, 78, 109, 21, 19, 57));
      LOG.info(integers);

      BoyerMooreHorspoolAlgorithm bmha = new BoyerMooreHorspoolAlgorithm();
      char[] pattern = "sed".toCharArray();
      char[] text = ("Lorem ipsum dolor sit amet, consetetur sadipscing "
          + "elitr, sed diam nonumy eirmod tempor").toCharArray();
      int index = bmha.find(pattern, text);

      LOG.info("Found text at index: " + index);
    };
  }

}
