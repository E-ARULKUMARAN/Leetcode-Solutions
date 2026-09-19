class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        if (xCenter >= x1 && xCenter <= x2 && yCenter >= y1 && yCenter <= y2) {
            return true;
        }
        List<List<Integer>> points = new ArrayList<>();
        points.add(List.of(x1, y1));
        points.add(List.of(x1, y2));
        points.add(List.of(x2, y2));
        points.add(List.of(x2, y1));
        for (int i = 0; i < 4; i++) {
            int x = points.get(i).get(0);
            int y = points.get(i).get(1);
            if (Math.sqrt(Math.pow(x - xCenter, 2) + Math.pow(y - yCenter, 2)) <= radius) {
                return true;
            }

        }
        int small =Math.min(y1,points.get(1).get(1));
        int large =Math.max(y1,points.get(1).get(1));
        for (int i = small; i <= large; i++) {
            if (Math.sqrt(Math.pow(x1 - xCenter, 2) + Math.pow(i - yCenter, 2)) <= radius) {
                return true;
            }
        }
        small =Math.min(x2,points.get(1).get(0));
        large =Math.max(x2,points.get(1).get(0));
        for (int i = small; i <= large; i++) {
            if (Math.sqrt(Math.pow(i - xCenter, 2) + Math.pow(y2 - yCenter, 2)) <= radius) {
                return true;
            }
        }
        small =Math.min(y2,points.get(3).get(1));
        large =Math.max(y2,points.get(3).get(1));
        for (int i = small; i <= large; i++) {
            if (Math.sqrt(Math.pow(x2 - xCenter, 2) + Math.pow(i - yCenter, 2)) <= radius) {
                return true;
            }
        }
        small =Math.min(x1,points.get(3).get(0));
        large =Math.max(x1,points.get(3).get(0));
        for (int i = small; i <= large; i++) {
            if (Math.sqrt(Math.pow(i - xCenter, 2) + Math.pow(y1 - yCenter, 2)) <= radius) {
                return true;
            }
        }
        return false;
    }
}