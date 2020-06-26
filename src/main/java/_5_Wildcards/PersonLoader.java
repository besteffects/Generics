package _5_Wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PersonLoader {
    private final RandomAccessFile file;

    public PersonLoader(final File file) throws FileNotFoundException
    {
        this.file = new RandomAccessFile(file, "rw");
    }

    public PersonWildcard load() throws ClassNotFoundException
    {
        try
        {
            final String className = file.readUTF();
            final String personName = file.readUTF();
            final int age = file.readInt();

            final Class<?> personClass = Class.forName(className);
            final Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            return (PersonWildcard) constructor.newInstance(personName, age);
        }
        catch (IOException e)
        {
            return null;
        }
        catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public void loadAll(final List<? super PersonWildcard> people) throws ClassNotFoundException
    {
        PersonWildcard person;

        while ((person = load()) != null)
        {
            people.add(person);
        }
    }
}