public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Traverse Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    String taskId = scanner.nextLine();
                    System.out.print("Enter Task Name: ");
                    String taskName = scanner.nextLine();
                    System.out.print("Enter Task Status: ");
                    String status = scanner.nextLine();
                    taskList.addTask(new Task(taskId, taskName, status));
                    System.out.println("Task added.");
                    break;

                case 2:
                    System.out.print("Enter Task ID to search: ");
                    taskId = scanner.nextLine();
                    Task task = taskList.searchTask(taskId);
                    if (task != null) {
                        System.out.println("Task found: " + task.getTaskId() + " - " + task.getTaskName() + " (" + task.getStatus() + ")");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 3:
                    System.out.println("All Tasks:");
                    taskList.traverseTasks();
                    break;

                case 4:
                    System.out.print("Enter Task ID to delete: ");
                    taskId = scanner.nextLine();
                    taskList.deleteTask(taskId);
                    System.out.println("Task deleted.");
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }