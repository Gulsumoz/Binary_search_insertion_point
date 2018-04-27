class InsertionPoint {
    public static void main(String[] args) {
        // Sample array
        Comparable arr[] = {10.3,20.7,30.8,40.9,50.8,60.9,70.5,80.9,90.9};

        int low = 0;
        int high = arr.length - 1;
        Double search = 10.3;
        int result = binarySearch(arr, search, low, high);
        System.out.println(" Found Index is "+ result);

    }

    public static int binarySearch(Comparable[] objArray, Comparable searchObj, int low, int high) {
        low = 0;
        high = objArray.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (objArray[mid].compareTo(searchObj) < 0) {
                low = mid + 1;

            } else if (objArray[mid].compareTo(searchObj) > 0) {
                high = mid - 1;

            } else
                return mid;
            }


        return low;
    }

}







