@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private PokemonRepository pokemonRepository;

    @Override
    public void run(String... args) throws Exception {
        Pokemon p1 = new Pokemon();
        p1.setNombre("Pikachu");

        System.out.println("Carga de datos inicial finalizada.");
    }
}