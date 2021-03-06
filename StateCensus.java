package com.StateCensusAnalyser;

import com.opencsv.bean.CsvBindByName;

public class StateCensus {
	
	public static String state;
	public static long population;
	public static long areaInSqKm;
	public static long densityPerSqKm;
	
	public StateCensus() {}
	
	public StateCensus(String state, long population, long areaInSqSKm, long densityPerSqKm) {
		this.state = state;
		this.population = population;
		this.areaInSqKm = areaInSqKm;
		this.densityPerSqKm = densityPerSqKm;
	}
	
	@Override
	public String toString() {
		return "IndiaCensusCSV{" +
                "State='" + state + '\'' +
                ", Population='" + population + '\'' +
                ", AreaInSqKm='" + areaInSqKm + '\'' +
                ", DensityPerSqKm='" + densityPerSqKm + '\'' +
                '}';
	}

}
