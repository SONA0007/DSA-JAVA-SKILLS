package com.ArraysInJava;

import java.util.Arrays;

/*Background
A shipping company needs to efficiently allocate various shipments into
available containers. Each shipment consists of a specific number of units,
and each container has a maximum capacity of units it can hold. The goal
is to determine the minimum number of containers required to
accommodate all shipments, even if units from the same shipment are split
across multiple containers.
Scenario
Company: SwiftLogistics
Shipments: The company has n shipments to be delivered. Each shipment
consists of a different number of units. This is represented by the array

shipments where shipments[i] indicates the number of units in the i-
th shipment.

Containers: The company also has m containers available for use, each
with a specific capacity. This is represented by the array
container_limits where container_limits[j] indicates the
maximum number of units that the j-th container can hold.
Problem
The operations team at SwiftLogistics needs to figure out the minimum
number of containers required to redistribute the units from all shipments
into the available containers.
*/
public class ShippingOptimization {

    public static int minimumContainers(int[] shipments, int[] containerLimits) {

        int totalShipments = Arrays.stream(shipments).sum();//  total units in shipments
        int totalContainerCapacity = Arrays.stream(containerLimits).sum();// total containers

        // If total capacity is less than total shipments, return -1
        if (totalContainerCapacity < totalShipments) {
            return -1;
        }

        // Sort the shipments and container limits in descending order
        Arrays.sort(shipments);
        Arrays.sort(containerLimits);

        reverseArray(shipments);
        reverseArray(containerLimits);

        int containerCount = 0;
        int i = 0;

        //using greedy approach
        for (int limit : containerLimits) {
            if (i >= shipments.length) {
                break; // All shipments are already accommodated
            }
            // Distribute units from the current shipment into the container
            while (i < shipments.length && shipments[i] <= limit) {
                limit -= shipments[i];
                i++;
            }
            containerCount++;
        }

        return containerCount;
    }

    private static void reverseArray(int[] array) { //Two-pointer approach
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] shipments = {10, 20, 30};
        int[] containerLimits = {15, 15, 20, 10};

        int result = minimumContainers(shipments, containerLimits);
        System.out.println("Minimum number of containers needed: " + result);
    }
}