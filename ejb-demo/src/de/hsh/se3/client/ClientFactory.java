package de.hsh.se3.client;

import de.hsh.se3.ejb2ejb.client.Ejb2EjbClient;
import de.hsh.se3.ejbLifecycle.client.EjbLifecycleClient;
import de.hsh.se3.interceptor.client.InterceptorClient;
import de.hsh.se3.jpaPersistent.client.JpaPersistentClient;
import de.hsh.se3.security.client.SecurityClient;
import de.hsh.se3.session.client.SessionClient;
import de.hsh.se3.soap.client.DiceRollerServiceClient;
import de.hsh.se3.transaction.client.TransactionClient;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mindau
 */
public class ClientFactory {
  public static final Map<Integer, String> CLIENTS = new HashMap<Integer, String>() {
        {
            put(1, "ejb2ejb");
            put(2, "ejbLifecycle");
            put(3, "interceptor");
            put(4, "jpaPersistent");
            put(5, "security");
            put(6, "transaction");
            put(7, "soap");
            put(8, "session");
        }
    };    
  /**
   * 
   * @param number demo number from map
   * @return 
   */
  public Client getClient(int number){
      if(number == 1){
          return new Ejb2EjbClient();
      }else if(number == 2){
          return new EjbLifecycleClient();
      }else if(number == 3){
          return new InterceptorClient();
      }else if(number == 4){
          return new JpaPersistentClient();
      }else if(number == 5){
          return new SecurityClient();
      }else if(number == 6){
          return new TransactionClient();
      }else if(number == 7){
          return new DiceRollerServiceClient();
      }else if(number == 8){
          return new SessionClient();//
      }
      return null;
  }
}
