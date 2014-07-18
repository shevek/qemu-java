package org.anarres.qemu.qapi.api;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiTypeDescriptor{name=XBZRLECacheStats, data={cache-size=int, bytes=int, pages=int, cache-miss=int, cache-miss-rate=number, overflow=int}, innerTypes=null}</pre></p>
 */
// QApiTypeDescriptor{name=XBZRLECacheStats, data={cache-size=int, bytes=int, pages=int, cache-miss=int, cache-miss-rate=number, overflow=int}, innerTypes=null}
public class XBZRLECacheStats extends QApiType {

	@SerializedName("cache-size")
	@Nonnull
	public long cacheSize;
	@SerializedName("bytes")
	@Nonnull
	public long bytes;
	@SerializedName("pages")
	@Nonnull
	public long pages;
	@SerializedName("cache-miss")
	@Nonnull
	public long cacheMiss;
	@SerializedName("cache-miss-rate")
	@Nonnull
	public double cacheMissRate;
	@SerializedName("overflow")
	@Nonnull
	public long overflow;

	public XBZRLECacheStats() {
	}

	public XBZRLECacheStats(long cacheSize, long bytes, long pages, long cacheMiss, double cacheMissRate, long overflow) {
		this.cacheSize = cacheSize;
		this.bytes = bytes;
		this.pages = pages;
		this.cacheMiss = cacheMiss;
		this.cacheMissRate = cacheMissRate;
		this.overflow = overflow;
	}
}
