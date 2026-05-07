@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @Autowired
    private PokemonService service;

    @GetMapping
    public ResponseEntity<List<Pokemon>> listar() {
        return ResponseEntity.ok(service.obtenerTodos());
    }

    @PostMapping
    public ResponseEntity<Pokemon> crear(@RequestBody Pokemon pokemon) {
        return null;
    }

}