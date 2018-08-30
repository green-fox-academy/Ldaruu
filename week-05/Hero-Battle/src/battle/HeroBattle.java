package battle;

import java.util.Arrays;
import java.util.List;


public class HeroBattle {
  /**
   * In this file we want to simulate a fight between Superheroes.
   * Please implement the necessary classes by the following specification
   * <p>
   * You will need a Hero class which is also a BaseHero and is a Punchable (these are provided to you)
   * It should have the following:
   * <p>
   * Properties
   * - motivation: a number representing how much the hero wants to save the world
   * <p>
   * Methods
   * - constructor: sets the hero's name and motivation
   * <p>
   * - getMotivationLevel: returns a number between 0 and 2
   * - 0 if the motivation below 25
   * - 1 if the motivation between 25 and 40
   * - 2 if motivation is above 40
   * <p>
   * - punch: take damage on the other hero by using his/her bePunched function with a damage:
   * - damage = the puncher hero's motivation / 1.5
   * - the hero punches other heroes only if his/her motivation level is at least 1
   * <p>
   * - bePunched: suffer damage, calculated like:
   * - motivation = motivation - (damage / motivation)
   * <p>
   * - toString: returns a string status report about the hero
   * - if the hero's motivation level is 0: {name} is not motivated anymore.
   * - if the hero's motivation level is 1: {name} is motivated.
   * - if the hero's motivation level is 2: {name} is well motivated.
   * <p>
   * You will need also a DCHero and a MarvelHero classes. They extend the Hero class
   * with a restriction, they cannot punch other heroes from the same "Universe":
   * - A MarvelHero shouldn't be able to punch another MarvelHero
   * - A DCHero shouldn't be able to punch another DCHero
   * Also they should have a default motivation if only the name is provided when we create them. Default values:
   * - MarvelHero: 40
   * - DCHero: 45
   * You don't need to modify this file, just add your imports to it.
   */

  public static void main(String[] args) {

    /*********************************************************
     *  Do not modify the code below except for test purpose *
     *********************************************************/
    List<BaseHero> heroes = Arrays.asList(
        new MarvelHero("Hulk", 55),
        new MarvelHero("Iron man", 35),
        new MarvelHero("Daredevil"),
        new DCHero("Batman", 60),
        new DCHero("Superman", 25),
        new DCHero("Wonder woman")
    );

    battle(heroes);

    log(heroes);

  }

  private static void battle(List<BaseHero> heroes) {
    while (anyHeroCanFight(heroes)) {
      for (BaseHero hero : heroes) {
        punchOtherHeroes(hero, heroes);
        System.out.println("X");
      }
    }
  }

  private static void log(List<BaseHero> heroes) {
    for (BaseHero hero : heroes) {
      System.out.println(hero);
    }
  }

  private static boolean anyHeroCanFight(List<BaseHero> heroes) {
    for (BaseHero hero : heroes) {
      if (hero.getMotivationLevel() > 1) {
        return true;
      }
    }
    return false;
  }

  private static void punchOtherHeroes(BaseHero hero, List<BaseHero> otherHeroes) {
    System.out.println(hero.getName() + "Im punching!");
    for (BaseHero otherHero : otherHeroes) {
      if (otherHero != hero && otherHero instanceof Punchable) {
        hero.punch((Punchable) otherHero);

      }
    }
  }
}
