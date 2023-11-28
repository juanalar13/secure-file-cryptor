# Final programming project
By 
- Nicolas Penagos
- Juan Felipe Alarcon

# How we made the program
For the development of the project, we used an MVC architecture, which stands for Model, View, and Controller. This architectural pattern allow us to separate software components. The 'View' is responsible for storing the graphical interface, specifically for the login functionality in our case, where we used JavaFX. The 'Controller' is responsible for facilitating communication between the 'View' and the 'Model.' Lastly, the 'Model' represents the backend, and by analogy, it's where the encryption process occurs in our program.

It's important to highlight that we included the Singleton pattern, which is a software design pattern that ensures a class has only one instance. In the context of this specific project, it's crucial as it prevents multiple encryption processes.

![MVS](https://4.bp.blogspot.com/-LSdEcy5ZlGY/WxMvPqGVw3I/AAAAAAAABwA/UGj7tfEfHvQ1qkKMNYGq-CM0kYH9thNvQCLcBGAs/s1600/mvc.png)

## Singleton Pattern in the code 
![Singleton Pattern Imagen](https://pbs.twimg.com/media/F__K6iVWAAAeUtM?format=jpg&name=small)

# Challenges encountered
In the difficulties we faced, we found ourselves in a situation where we had never done a practice like this before. Initially, we didn't have much skill, and it was necessary to investigate part by part. Also, we had to decide how we were going to store the 'inputs', meaning, without considering the available libraries for encryption and decryption, but rather using a class called 'ObjectInputStream' that allows us to write objects and load them.
We can say that thanks to very good documentation we found, it allowed us to have an agile development regarding Java's IV


```
String salt = generateSalt();
            SecretKey key = getKeyFromPassword(password, salt);
            IvParameterSpec iv = generateIV();
            byte[] hashSHA256 = calculateSHA256(filePath);
```

[Documentation found that helped us](https://www.baeldung.com/java-aes-encryption-decryption).
            
# Conclusions
In conclusion, we have:

- Effective use of the MVC architecture.
- The importance of including the Singleton pattern, as it ensured that there was only one instance responsible for encryption processes, thereby avoiding potential issues related to multiple instances.
- The decision to use the "ObjectInputStream" class to store objects, instead of relying exclusively on external libraries, demonstrated flexibility and adaptability in the approach to the solution.
- For a successful practice, it is crucial to understand and apply cryptographic techniques, such as the use of Diffie-Hellman, AES, RSA, and PBKDF2, as it relates to the effective application of security principles in the program's development.
- Attention to security considerations, including the incorporation of salt and the use of robust algorithms, reflects a practical and responsible approach to password management and cryptographic processes.
- The combination of a structured approach, continuous learning, and good documentation enabled successful development and implementation of a robust program that effectively addresses the security requirements set for the project.





#### Thanks for read.
