// 🛠 Quick Task
// 🔹 Write a Java program that:
// ✅ Creates a StringBuffer and StringBuilder.
// ✅ Appends the same text multiple times.
// ✅ Compares their execution time.

class Main {
    public static void main(String[] args) {
        long startTime, endTime;
        
        // Testing StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb.append("World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // Testing StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello");
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            sb2.append("World");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}
