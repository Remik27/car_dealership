package zajavka.pl.service;

import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class CommandListExecutorImpl implements CommandListExecutor{

    private final SalesmanService salesmanService;

    private final MechanicService mechanicService;

    private final CarToBuyService carToBuyService;

    private final ServiceService serviceService;

    private final PartService partService;

    private final CustomerService customerService;

    @Override
    public void exec(List<String> commands) {
        commands.forEach(this::execCommand);
    }

    private void execCommand(String command) {
        String[] splitedCommand = command.split("->");
        switch (splitedCommand[1]){
            case "SALESMAN" -> {
                salesmanActions(splitedCommand);
            }
            case "MECHANIC" -> {
                mechanicActions(splitedCommand);
            }
            case "CAR" -> {
                carActions(splitedCommand);
            }
            case "SERVICE" -> {
                serviceCommands(splitedCommand);
            }
            case "PART" -> {
                partActions(splitedCommand);
            }
            case "CUSTOMER" -> {
                customerActions(splitedCommand);
            }
        }

    }

    private void customerActions(String[] splitedCommand) {
        switch (splitedCommand[0]){
            case "BUY_FIRST_TIME" ->{

            }
            case "BUY_AGAIN" -> {

            }
            case "SERVICE_REQUEST" -> {

            }
        }
    }

    private void partActions(String[] splitedCommand) {
        switch (splitedCommand[0]){
            case "INIT" -> {
                partService.add(splitedCommand[2]);
            }
        }
    }

    private void serviceCommands(String[] splitedCommand) {
        switch (splitedCommand[0]){
            case "INIT" -> {
                serviceService.add(splitedCommand[2]);
            }
        }
    }

    private void carActions(String[] splitedCommand) {
        switch (splitedCommand[0]){
            case "INIT" -> {
                carToBuyService.add(splitedCommand[2]);
            }
        }
    }

    private void mechanicActions(String[] splitedCommand) {
        switch (splitedCommand[0]){
            case "INIT" -> {
                mechanicService.add(splitedCommand[2]);
            }
            case "DO_THE_SERVICE" -> {

            }
        }
    }

    private void salesmanActions(String[] splitedCommand) {
        switch (splitedCommand[0]){
            case "INIT" -> {
                salesmanService.add(splitedCommand[2]);
            }
        }

    }
}
