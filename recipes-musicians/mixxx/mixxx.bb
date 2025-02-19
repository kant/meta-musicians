SUMMARY = "Qt based DJ software"
HOMEPAGE = "http://mixxx.org/"
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e5323335634095f8bdd15f6a5c5c5865"

inherit cmake_qt5 gtk-icon-cache features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    qtbase \
    qtscript \
    qtsvg \
    qtxmlpatterns \
    qtx11extras \
    qtkeychain \
    qttools-native \
    libusb1 \
    hidapi \
    upower \
    sqlite3 \
    libid3tag \
    taglib \
    libmad \
    faad2 \
    libmp4v2 \
    libogg \
    libvorbis \
    protobuf protobuf-native \
    fftw \
    portaudio-v19 \
    portmidi \
    chromaprint \
    rubberband \
    soundtouch \
    libglu \
    lilv \
    lame \
    wavpack \
    libmodplug \
    libkeyfinder \
    libebur128 \
"
# causes segfault trying to find debug libs
#    gperftools

SRC_URI = " \
    git://github.com/mixxxdj/${BPN}.git;branch=main \
"
SRCREV = "d1dca4785af375af8f73b5ee5389311f4a4ef5e6"
S = "${WORKDIR}/git"
PV = "2.3.0"

EXTRA_OECMAKE += " \
    -DSHOUTCAST=OFF \
    -DLOCALECOMPARE=OFF \
    -DFAAD=ON \
"
#    -DPERFTOOLS=ON

FILES_${PN} += " \
    ${datadir}/appdata \
    ${datadir}/metainfo \
"
