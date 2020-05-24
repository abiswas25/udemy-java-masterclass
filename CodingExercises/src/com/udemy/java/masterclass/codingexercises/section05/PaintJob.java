package com.udemy.java.masterclass.codingexercises.section05;

public class PaintJob {

	public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		}

		double bucketsToGet = ((width * height) / areaPerBucket) - extraBuckets;
		return (int) Math.ceil(bucketsToGet);
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double bucketsToGet = ((width * height) / areaPerBucket);
		return (int) Math.ceil(bucketsToGet);
	}

	public static int getBucketCount(double area, double areaPerBucket) {
		if (area <= 0 || areaPerBucket <= 0) {
			return -1;
		}

		double bucketsToGet = area / areaPerBucket;
		return (int) Math.ceil(bucketsToGet);
	}

}
