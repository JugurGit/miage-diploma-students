package fr.pantheonsorbonne.miage;

import java.io.InputStream;

/**
 * a Diploma generator for the MIAGE section
 * 
 * @author nherbaut
 *
 */
public interface DiplomaGenerator {

	/**
	 * Generate the diploma in a Stream
	 * 
	 * @return
	 * @throws GenerateFileException 
<<<<<<< HEAD
<<<<<<< HEAD
	 */
	InputStream getContent() throws GenerateFileException;
=======
	 * @throws GeneratorDocumentException 
	 */
	InputStream getContent() throws GenerateFileException, GeneratorDocumentException;
>>>>>>> master
=======
	 * @throws GeneratorDocumentException 
	 */
	InputStream getContent() throws GenerateFileException, GeneratorDocumentException;
>>>>>>> master

}