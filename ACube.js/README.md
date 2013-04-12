# ACube.js

Converted from C++ using [Emscripten](https://github.com/kripken/emscripten).

GWT might work on the newer Java source, but:
- GWT is harder to use
- Emscripten doesn't have to worry about garbage collection.
- Emscripten produces [asm.js](http://asmjs.org/) output.

## Usage

HTML files are in `./html`. Run `make js`, and open one of the test pages. Note that only the simple example will work in Chrome if you're opening a file locally.
