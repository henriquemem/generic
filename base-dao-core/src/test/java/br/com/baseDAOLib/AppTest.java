/*
 * Copyright 2015 Henrique Luiz da Silva Mota
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package br.com.baseDAOLib;

import java.util.Date;

import javax.inject.Inject;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.baseDAOLib.DAO.UsuarioDAO;
import br.com.baseDAOLib.entity.Email;
import br.com.baseDAOLib.entity.Usuario;

/**
 * Unit test for simple App.
 */
//@RunWith(WeldJUnit4Runner.class)
public class AppTest 
    extends TestCase
{
	
	@Inject
	private UsuarioDAO usuarioDAO; 
	

}
