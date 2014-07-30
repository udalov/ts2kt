package browserify

native
public trait `T$0` {
    public var expose: String
}
native
public trait `T$1` {
    public var insertGlobals: Boolean? = noImpl
    public var detectGlobals: Boolean? = noImpl
    public var debug: Boolean? = noImpl
    public var standalone: String? = noImpl
    public var insertGlobalVars: Any? = noImpl
}
native
public trait BrowserifyObject : NodeJS.EventEmitter {
    public fun add(file: String): BrowserifyObject
    public fun require(file: String, opts: `T$0`? = null): BrowserifyObject
    public fun bundle(opts: `T$1`? = null, cb: ((err: Any, src: Any) -> Unit)? = null): NodeJS.ReadableStream
    public fun external(file: String): BrowserifyObject
    public fun ignore(file: String): BrowserifyObject
    public fun transform(tr: String): BrowserifyObject
    public fun transform(tr: Function): BrowserifyObject
}
module
public object browserify {
    module("browserify")
    public fun browserify(): BrowserifyObject = noImpl
    module("browserify")
    public fun browserify(files: Array<String>): BrowserifyObject = noImpl
    public trait `T$2` {
        public var entries: Array<String>? = noImpl
        public var noParse: Array<String>? = noImpl
    }
    // ???
    module("browserify")
    public fun browserify(opts: `T$2`): BrowserifyObject = noImpl
}
