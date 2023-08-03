package teach.aistar.day13.Snack;

import java.util.Objects;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 11:22
 */
public class Node {
        private int x;
        private int y;

        public Node() {
        }

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Node{");
            sb.append("x=").append(x);
            sb.append(", y=").append(y);
            sb.append('}');
            return sb.toString();
        }

}
