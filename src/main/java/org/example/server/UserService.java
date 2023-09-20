package org.example.server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {

    @WebMethod
    User findByName(String name);

}
