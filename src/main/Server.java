package main;import java.security.Key;import java.util.HashMap;import java.util.Map;/** * Created by valeriocassani on 10/03/15. */public class Server {    Map<Client, Key> table;    public Server() {        table = new HashMap<Client, Key>();    }    public boolean connect(Client client) {}