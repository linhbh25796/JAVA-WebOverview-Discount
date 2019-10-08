public class DisplayProduct {
    public String createByProduct(Product product){
        String template = "\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Product Discount Calculator</title>\n" +
                "        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <div id=\"content\">\n" +
                "            <h1>Product Discount Calculator</h1>\n" +
                "            <label>Product Description: </label>\n" +
                "            <span>_price_description_</span><br/>\n" +
                "            <label>Price: </label>\n" +
                "            <span>_price_data_</span><br/>\n" +
                "            <label>Discount Percent: </label>\n" +
                "            <span>_percent_data_</span><br/>\n" +
                "            <label>Discount Amount: </label>\n" +
                "            <span>_discount_amount_</span><br/>\n" +
                "            <label>Discount Price: </label>\n" +
                "            <span>_discount_price_</span><br/>\n" +
                "        </div>\n" +
                "    </body>\n" +
                "</html>";
        String output ;
        output =template.replaceAll("_price_description_",product.getDescription()+"");
        output = output.replaceAll("_price_data_", product.getPrice() +"" );
        output = output.replaceAll("_percent_data_",product.getDiscount_percent()+"");
        output = output.replaceAll("_discount_amount_",product.getDicount_amount()+"");
        output = output.replaceAll("_discount_price_",product.getDiscount_price() +"");
        return  output;
    }
}
