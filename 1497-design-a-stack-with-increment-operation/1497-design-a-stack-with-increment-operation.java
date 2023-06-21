class CustomStack {
    int[] data;
    int ptr = 0;
    int max;

    public CustomStack(int maxSize) {
        this.data = new int[maxSize];
        this.max = maxSize;
    }

    public void push(int x) {
        if (ptr == data.length) {
            return;
        }
        data[ptr++] = x;
    }

    public int pop() {
        if (ptr == 0) {
            return -1;
        }
        return data[--ptr];
    }

    public void increment(int k, int val) {
        if (k > ptr) {
            for (int i = 0; i < max; i++) {
                data[i] = data[i] + val;
            }
        } else {
            for (int i = 0; i < k; i++) {
                data[i] = data[i] + val;
            }
        }
    }
}
