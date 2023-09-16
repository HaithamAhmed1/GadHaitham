public class task2 {
    public static void main(String[] args) {
        int area1 = 10;
        int area2 = 15;
        int area3 = 20;


        int maxAreaIf = area1;
        if (area2 > maxAreaIf) {
            maxAreaIf = area2;
        }
        if (area3 > maxAreaIf) {
            maxAreaIf = area3;
        }
        System.out.println("Maximum area (via if): " + maxAreaIf);


        int maxAreaTernary = (area1 > area2) ? ((area1 > area3) ? area1 : area3) : ((area2 > area3) ? area2 : area3);
        System.out.println("Maximum area (after ?:): " + maxAreaTernary);


        int maxAreaMaxFunction = Math.max(Math.max(area1, area2), area3);
        System.out.println("Maximum area (using the .max()) function: " + maxAreaMaxFunction);
    }
}