package tasks;

public class Environment {
    public static void main(String[] args) {

        String env = "dev integrate";
        int node = 1;

        testUpload(env, node);
    }

    public static void testUpload(String evn, int nodeIndex){
        String envName = null;
        int nodeId = 0;

        switch (evn){
            case "dev integrate":
                envName = "integration";
                int[] arr1 = {2054,2055,2057};
                nodeId = arr1[nodeIndex];
                break;
            case "stage":
                envName = "staging";
                int[] arr2 = {1013,1014,1015};
                nodeId = arr2[nodeIndex];
                break;
            case "demo":
                envName = "demo";
                int[] arr3 = {1519,1520,1521};
                nodeId = arr3[nodeIndex];
                break;
            default:
                System.out.println("wrong evn name");
        }

        System.out.println("envName = " + envName);
        System.out.println("nodeId = " + nodeId);
    }
}
