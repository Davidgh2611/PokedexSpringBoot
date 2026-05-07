@Service
public class PokemonService {
    @Autowired
    private PokemonRepository repository;

    public List<Pokemon> obtenerTodos() {
        return repository.findAll();
    }

    public Pokemon guardar(Pokemon pokemon) {
        return null;
    }
}