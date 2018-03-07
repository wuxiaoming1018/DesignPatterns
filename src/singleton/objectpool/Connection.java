package singleton.objectpool;

/**
 * @author wuxiaoming
 * @date 2018-03-07 15:04
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 对象池思想(保证能出现对象的最大个数)
 */
public class Connection {
    private static int MAX = 5;//最多对象个数
    private static Map<Integer, Connection> map = new HashMap<>();
    private static int key = 1;

    public static Connection getConnection(){
        Connection connection = map.get(key);
        if (connection == null) {
            connection = new Connection();
            map.put(key,connection);
        }
        key++;
        if (key>MAX) {
            key=1;
        }
        return connection;
    }
}
