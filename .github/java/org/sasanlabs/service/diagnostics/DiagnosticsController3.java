@RestController
public class DiagnosticsController {

    @GetMapping("/diagnostics/ping")
    public String ping(@RequestParam("host") String host) throws IOException {
        Process process = Runtime.getRuntime()
                .exec(new String[] {"/bin/sh", "-c", "ping -c 1 " + host});
        // ... read stdout, return it
    }
}
