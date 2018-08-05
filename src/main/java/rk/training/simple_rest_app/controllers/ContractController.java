package rk.training.simple_rest_app.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rk.training.simple_rest_app.dto.Contract;

/**
 * @author: Rafał Kwiatkowski
 * @created: 05.08.2018 12:33
 */

@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {

    public static final String CONTRACT_BASE_URI = "v1/contract";

    @RequestMapping(value = "{contactNumber}")
    public Contract getContract(@PathVariable final int contactNumber) {
        Contract contract = new Contract();
        contract.setName("Rafał");
        contract.setId(contactNumber);
        return contract;
    }
}
