package com.StateCensusAnalyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

import com.CSVBuilder.*;

public class StateCodeAnalyser {
	
	public int loadCSVFile(Path path) throws CensusException, CSVException {
		try (Reader reader = Files.newBufferedReader(path)){
			ICSVBuilder csvBuilder = CSVBuilderFactory.createCSVBuilder();
			Iterator<StateCensus> stateCensusIterator = csvBuilder.getCSVFileIterator(reader, StateCensus.class);
			return new OpenCSVBuilder().getCount(stateCensusIterator);
		}
		catch(IOException e) {
			throw new CensusException("File not found", CensusException.ExceptionType.WRONG_CSV); 
		}
		catch(RuntimeException e) {
			throw new CensusException("File internal data not valid", CensusException.ExceptionType.WRONG_HEADER);
		}
	}
	

}
