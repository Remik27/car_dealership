package zajavka.pl.service;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CommandListExecutorImpl implements CommandListExecutor {

    private final SalesmanService salesmanService;

    private final MechanicService mechanicService;

    private final CarToBuyService carToBuyService;

    private final ServiceService serviceService;
    private final InvoiceService invoiceService;

    private final PartService partService;

    private final CarServiceRequestService carServiceRequestService;
    private final ServiceMechanicService serviceMechanicService;

    @Override
    public void exec(List<String> commands) {
        commands.forEach(this::execCommand);
    }

    private void execCommand(String command) {
        String[] splitedCommand = command.split("->");
        switch (splitedCommand[1]) {
            case "SALESMAN" -> salesmanActions(splitedCommand);
            case "MECHANIC" -> mechanicActions(splitedCommand);
            case "CAR" -> carActions(splitedCommand);
            case "SERVICE" -> serviceCommands(splitedCommand);
            case "PART" -> partActions(splitedCommand);
            case "CUSTOMER" -> customerActions(splitedCommand);
        }

    }

    private void customerActions(String[] splitedCommand) {
        switch (splitedCommand[0]) {
            case "BUY_FIRST_TIME" -> invoiceService.buyFirstTime(splitedCommand[2]);
            case "BUY_AGAIN" -> invoiceService.buyAgain(splitedCommand[2]);
            case "SERVICE_REQUEST" -> carServiceRequestService.add(splitedCommand[2]);
        }
    }

    private void partActions(String[] splitedCommand) {
        if ("INIT".equals(splitedCommand[0])) {
            partService.add(splitedCommand[2]);
        }
    }

    private void serviceCommands(String[] splitedCommand) {
        if ("INIT".equals(splitedCommand[0])) {
            serviceService.add(splitedCommand[2]);
        }
    }

    private void carActions(String[] splitedCommand) {
        if ("INIT".equals(splitedCommand[0])) {
            carToBuyService.add(splitedCommand[2]);
        }
    }

    private void mechanicActions(String[] splitedCommand) {
        switch (splitedCommand[0]) {
            case "INIT" -> mechanicService.add(splitedCommand[2]);
            case "DO_THE_SERVICE" -> serviceMechanicService.doTheService(splitedCommand[2]);
        }
    }

    private void salesmanActions(String[] splitedCommand) {
        if ("INIT".equals(splitedCommand[0])) {
            salesmanService.add(splitedCommand[2]);
        }

    }
}
