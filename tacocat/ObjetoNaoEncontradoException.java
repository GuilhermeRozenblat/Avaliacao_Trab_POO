/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tacocat;

import java.io.IOException;

/**
 *
 * @author Guilherme
 */
public class ObjetoNaoEncontradoException extends IOException{
    public ObjetoNaoEncontradoException(){
        super("Objeto não encontrado");
        
    }
    
}
