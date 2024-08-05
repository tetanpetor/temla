try {
    // Load the template
    Template template = cfg.getTemplate("example.ftl");

    // Create a data model
    Map<String, Object> dataModel = new HashMap<>();
    dataModel.put("name", "World");

    // Process the template and write the output to the console
    Writer out = new OutputStreamWriter(System.out);
    template.process(dataModel, out);
    out.flush();
} catch (IOException | TemplateException e) {
    e.printStackTrace();
}
