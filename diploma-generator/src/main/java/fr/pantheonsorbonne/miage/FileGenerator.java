package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<GENERATOR extends DiplomaGenerator> {

	protected final GENERATOR generator;

	public FileGenerator(GENERATOR t) {
		this.generator = t;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public abstract void generateFile(String outputFile) throws WriteException, GenerateFileException;
=======
	public abstract void generateFile(String outputFile) throws GenerateFileException, GeneratorDocumentException, WriteFileException;
>>>>>>> master
=======
	public abstract void generateFile(String outputFile) throws GenerateFileException, GeneratorDocumentException, WriteFileException;
>>>>>>> master
}
