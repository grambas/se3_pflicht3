package de.hsh.se3.client;

import de.hsh.se3.jpaPersistent.client.JpaPersistentClient;
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
            put(7, "SOAP");
            //put(8, "verschiedene Session Beans");
        }
    };    
  /**
   * 
   * @param number demo number from map
   * @return 
   */
  public Client getClient(int number){
      if(number == 1){
          return null;//TODO ejb2ejb client
      }else if(number == 2){
          return null;//TODO ejbLifecycle client
      }else if(number == 3){
          return null;//TODO interceptor client
      }else if(number == 4){
          return new JpaPersistentClient();
      }else if(number == 5){
          return null;//TODO security client
      }else if(number == 6){
          return new TransactionClient();
      }else if(number == 7){
          return null;//TODO SOAP client
      }else if(number == 8){
          return null;//TODO 2 session beans? client
      }
      return null;
  }
}
