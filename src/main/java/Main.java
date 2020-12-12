import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {

    private final JDA jda;

    public Main(String token) throws LoginException {
        this.jda = JDABuilder.createDefault(token).build();
    }

    public static void main(String... args) throws LoginException {
        new Main(args[0]).start();
    }

    private void start() {
        jda.addEventListener();
    }

}
