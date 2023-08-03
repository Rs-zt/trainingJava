package teach.aistar.day14;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 17:57
 */
public class MyEntry<K,V> {
    private K key;
    private V value;

    public MyEntry() {
    }

    public MyEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyEntry{");
        sb.append("key=").append(key);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
