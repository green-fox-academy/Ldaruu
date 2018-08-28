import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Pokemon> pokemonOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!
//    Pokemon mypokemon = new Pokemon("Belus","fire","water");
    Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");
    for (int i = 0; i < pokemonOfAsh.size(); i++) {
      if (pokemonOfAsh.get(i).isEffectiveAgainst(wildPokemon)) {

        // Which pokemon should Ash use?

        System.out.print("I choose you, "+ pokemonOfAsh.get(i).name+ " you are my "+ pokemonOfAsh.get(i).type+" Pokemon!");
      }
    }
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
    pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
    pokemon.add(new Pokemon("Balbasaur", "water", "fire"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}
