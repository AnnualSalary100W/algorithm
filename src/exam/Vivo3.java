package exam;

import java.io.*;
import java.util.*;

/**
 * Welcome to vivo !
 */

/*
输入包括三个参数，空格分隔，分别表示服务器的磁盘大小、内存大小，以及应用程序列表；
其中第三个参数即应用程序列表，表述方式为：多个应用程序信息之间用 '#' 分隔，每个应用程序的信息包括 ','
分隔的部署所需磁盘空间、内存、允许访问的用户量三个数字；
比如 50,20,2000 表示部署该应用程序需要50G磁盘空间，20G内存，允许访问的用户数是2000
 */
public class Vivo3 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        String[] input = inputStr.split(" ");
        int totalDisk = Integer.parseInt(input[0]);
        int totalMemory = Integer.parseInt(input[1]);
        List<Service> services = parseServices(input[2].split("#"));
        int output = solution(totalDisk, totalMemory, services);
        System.out.println(output);
    }

    private static int solution(int totalDisk, int totalMemory, List<Service> services) {
        // TODO Write your code here
        int[][][] u = new int[services.size()+1][totalDisk+1][totalMemory+1];
        Service s;
        // d[i]>D u[i][D][M]=u[i-1][D][M],m[i]>M u[i][D][M]=u[i-1][D][M],
        // d[i]<=D u[i][D][M]=max{u[i-1][D][M],u[i-1][D-d[i]][M-m[i]]+s[i]}
        for(int i=1;i<=services.size();i++){
            for(int D=1;D<=totalDisk;D++){
                for(int M=1;M<=totalMemory;M++){
                    s=services.get(i-1);
                    if(s.getDisk()>D||s.getMemory()>M) u[i][D][M]=u[i-1][D][M];
                    else u[i][D][M]=Math.max(u[i-1][D][M],u[i-1][D-s.getDisk()][M-s.getMemory()]+s.getusers());
                }
            }
        }

        return u[services.size()][totalDisk][totalMemory];

        // TODO Write your code here


    }

    private static List<Service> parseServices(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList<Service>(0);
        }
        List<Service> services = new ArrayList<>(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String[] serviceArr = strArr[i].split(",");
            int disk = Integer.parseInt(serviceArr[0]);
            int memory = Integer.parseInt(serviceArr[1]);
            int users = Integer.parseInt(serviceArr[2]);
            services.add(new Service(disk, memory, users));
        }
        return services;
    }

    static class Service {
        private int disk;

        private int memory;

        private int users;

        public Service(int disk, int memory, int users) {
            this.disk = disk;
            this.memory = memory;
            this.users = users;
        }

        public int getDisk() {
            return disk;
        }

        public void setDisk(int disk) {
            this.disk = disk;
        }

        public int getMemory() {
            return memory;
        }

        public void setMemory(int memory) {
            this.memory = memory;
        }

        public int getusers() {
            return users;
        }

        public void setusers(int users) {
            this.users = users;
        }
    }
}