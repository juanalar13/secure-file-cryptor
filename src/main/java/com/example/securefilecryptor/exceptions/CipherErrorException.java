package com.example.securefilecryptor.exceptions;

import com.example.securefilecryptor.constants.Message;

/**
 * The {@code CorruptedFileException} class is an exception that is thrown when a file is determined to be corrupted
 * during file encryption or decryption processes. It provides an error message obtained from predefined constants
 * in the {@code Message} class.
 *
 * @author nicolaspenagos
 * @version 1.0
 */
public class CipherErrorException extends Exception{
    public CipherErrorException(){
        super(Message.CIPHER_ERROR.getMessage());
    }
}
