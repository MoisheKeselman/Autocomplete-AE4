package autocomplete;

import java.util.Collection;
import java.util.List;
import java.util.Queue;

/**
 * Ternary search tree (TST) implementation of the {@link Autocomplete} interface.
 *
 * @see Autocomplete
 */
public class TernarySearchTreeAutocomplete implements Autocomplete {
    /**
     * The overall root of the tree: the first character of the first autocompletion term added to this tree.
     */
    private Node overallRoot;

    /**
     * Constructs an empty instance.
     */
    public TernarySearchTreeAutocomplete() {
        overallRoot = null;
    }

    @Override
    public void addAll(Collection<? extends CharSequence> terms) {
        // TODO: Replace with your code
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<CharSequence> allMatches(CharSequence prefix) {
        // TODO: Replace with your code
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * A search tree node representing a single character in an autocompletion term.
     */
    private static class Node {
        private final char data;
        private boolean isTerm;
        private Node left;
        private Node mid;
        private Node right;

        public Node(char data) {
            this.data = data;
            this.isTerm = false;
            this.left = null;
            this.mid = null;
            this.right = null;
        }
    }

//    public Iterable<String> keysWithPrefix(String prefix) {
//        if (prefix == null) {
//            throw new IllegalArgumentException("calls keysWithPrefix() with null argument");
//        }
//        Queue<String> queue = Queue<String>();
//        Node x = get(root, prefix, 0);
//        if (x == null) return queue;
//        if (x.val != null) queue.enqueue(prefix);
//        collect(x.mid, new StringBuilder(prefix), queue);
//        return queue;
//    }
//
//    public Value get(String key) {
//        if (key == null) {
//            throw new IllegalArgumentException("calls get() with null argument");
//        }
//        if (key.length() == 0) throw new IllegalArgumentException("key must have length >= 1");
//        Node<Value> x = get(root, key, 0);
//        if (x == null) return null;
//        return x.val;
//    }
//
//    // return subtrie corresponding to given key
//    private Node<Value> get(Node<Value> x, String key, int d) {
//        if (x == null) return null;
//        if (key.length() == 0) throw new IllegalArgumentException("key must have length >= 1");
//        char c = key.charAt(d);
//        if      (c < x.c)              return get(x.left,  key, d);
//        else if (c > x.c)              return get(x.right, key, d);
//        else if (d < key.length() - 1) return get(x.mid,   key, d+1);
//        else                           return x;
//    }
//
//    public void put(String key, Value val) {
//        if (key == null) {
//            throw new IllegalArgumentException("calls put() with null key");
//        }
//        if (!contains(key)) n++;
//        else if(val == null) n--;       // delete existing key
//        root = put(root, key, val, 0);
//    }
//
//    private Node<Value> put(Node<Value> x, String key, Value val, int d) {
//        char c = key.charAt(d);
//        if (x == null) {
//            x = new Node<Value>();
//            x.c = c;
//        }
//        if      (c < x.c)               x.left  = put(x.left,  key, val, d);
//        else if (c > x.c)               x.right = put(x.right, key, val, d);
//        else if (d < key.length() - 1)  x.mid   = put(x.mid,   key, val, d+1);
//        else                            x.val   = val;
//        return x;
//    }
//
//    public boolean contains(String key) {
//        if (key == null) {
//            throw new IllegalArgumentException("argument to contains() is null");
//        }
//        return get(key) != null;
//    }
}
