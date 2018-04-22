var webpack = require("webpack");
var path = require("path");

module.exports = {
    entry: path.resolve(__dirname, "build/classes/kotlin/main/externalInterface.js"),
    output: {
        path: path.resolve(__dirname, "build"),
        filename: "bundle.js"
    },
    resolve: {
        modules: [path.resolve(__dirname, "node_modules"), path.resolve(__dirname, "build/kotlin-js-min/main/")]
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                use: ["source-map-loader"],
                enforce: "pre"
            }
        ]
    },
    devtool: "inline-source-map",
    devServer: {
        contentBase: "./src/main/web/",
        port: 9000,
        hot: true
    },
    plugins: [
        new webpack.HotModuleReplacementPlugin()
    ]
};